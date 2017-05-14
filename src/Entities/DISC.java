package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import resources.DISC_Data;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class DISC extends AbstractItem {
    private int Dom,Inf,Sta,Com;
    public boolean isUsed;
    public final int totalQuestions = 72;
    public static ArrayList<Question> questions;
    public static ArrayList<Question> oldQuestions;
    public static Question[] usedQuestions;
    public int completion;
    public boolean first1;
    public double price;

    public Question nextQuestion;

    public DISC(){
        Dom = 0;
        Inf = 0;
        Sta = 0;
        Com = 0;
        initialize();
        convertQuestions();
    }

    public DISC(double cost, boolean isUsed, String productName, String description, testType type ) {
        super(cost, isUsed, productName, description, type);
        Dom = 0;
        Inf = 0;
        Sta = 0;
        Com = 0;
        this.Complete = getCompletion();
        initialize();
        convertQuestions();
    }




    public void convertQuestions(){
        usedQuestions = new Question[totalQuestions];
        for (int i = 0; i < totalQuestions; i++){
            usedQuestions[i] = questions.get(i);
        }
    }


    public int getDom() {

        return Dom;
    }

    private void setDom(int dom) {

        this.Dom += dom;
    }

    public int getInf() {

        return Inf;
    }

    private void setInf(int inf) {

        this.Inf += inf;
    }

    public int getSta() {

        return Sta;
    }

    private void setSta(int sta) {

        this.Sta += sta;
    }

    public int getCom() {

        return Com;
    }

    public void setCom(int com) {

        this.Com += com;
    }

    public void setQuestions(ArrayList<Question> questions){
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions(){
        return this.questions;
    }

    public void setOldQuestions(ArrayList<Question> oldQuestions) {
        this.oldQuestions = oldQuestions;
    }

    public ArrayList<Question> getOldQuestions() {
        return this.oldQuestions;
    }




    /**********************************************
     * This method will	begin the DISC-test logic *
     **********************************************/

    private void initialize(){

        oldQuestions = new ArrayList<>();
        questions = new ArrayList<>();
        for (int i = 0; i < totalQuestions; i++){
            questions.add(i,new Question(DISC_Data.DISCWord_Data[i],DISC_Data.QuestionNo_DATA[i],DISC_Data.DISCTYPE_Data[i]));
        }
    }

    /*********************************************************************
     * This method will	get the next question from the list of questions *
     *********************************************************************/

    public Question QUEUELOGIC() {

            this.nextQuestion = usedQuestions[0];
            if (!nextQuestion.getAnswered()) {
                //ACTION
                for (int i = 0; i < (usedQuestions.length - 1); i++) {
                    usedQuestions[i] = usedQuestions[i + 1];
                }
                usedQuestions[usedQuestions.length-1] = this.nextQuestion;
            }

        else {
                return null;
                }

        System.out.println(Inf + " "+ Com + " " +Sta + " " +Dom);
            return nextQuestion;
    }

    public Question QUEUELOGIC2(int index){
        Question temp = questions.get(index);
        if (!temp.getAnswered()){
            return temp;
        }
        else {
            return null;
        }


    }

    /**********************************
     * This method will	set the score *
     *********************************/

    public void setScore(Question question,int score){

    switch(question.getType()){

        case Com:
            setCom(score);
            break;
        case Sta:
            setSta(score);
            break;
        case Inf:
            setInf(score);
            break;
        case Dom:
            setDom(score);
            break;
    }
    }

    public testType getTestType(){
        return super.getTestType();
    }
    public void setTestType(testType type){
        super.setTestType(type);
    }

    /**********************************************************
     * This method will	set the answered question as answered *
     **********************************************************/

    public void setQuestionAnswered(Question question){

        int position = getQuestionPosition(question);
        usedQuestions[position].setAnswered(true);
        calculateCompletion(totalQuestions,question.getQuestionNo());
        getCompletion();
    }
    public void setQuestionAnswered2(int index){
        questions.get(index).setAnswered(true);
        oldQuestions.add(questions.get(index));
        questions.remove(index);
        calculateCompletion(totalQuestions,questions.get(index).getQuestionNo());
        getCompletion();
    }

    /***************************************
     * This method will	get the completion *
     ***************************************/

    public int getCompletion(){
        System.out.println("Progress " + super.getCompletion());
        return super.Complete;
    }

    /*********************************************
     * This method will	calculate the completion *
     *********************************************/

    public void calculateCompletion(int totalQuestions, int currentQuestionNo ){
        super.calculateCompletion(totalQuestions,currentQuestionNo);
    }

    /*********************************************************
     * This method will	check for the position of a question *
     *********************************************************/

    private int getQuestionPosition(Question question){

        int number  = 0;
        for(int i = 0; i < totalQuestions; i++){
            if(question == usedQuestions[i])
                number = i;
        }
        return number;

    }

    /**************************************************
     * This method will	get the number of a questions *
     **************************************************/

    public int getQuestionNumber(Question question){
        int position = getQuestionPosition(question);
        return usedQuestions[position].getQuestionNo();

    }
    public int getQuestionNumber2(Question question){
        return question.getQuestionNo();
    }

    /****************************
     * The DISC-test logic ends *
     ****************************/

    @Override
    public String toString() {
        return "DISC{" +
                "Dom=" + Dom +
                ", Inf=" + Inf +
                ", Sta=" + Sta +
                ", Com=" + Com +
                ", isUsed=" + isUsed +
                ", Complete=" + Complete +
                ", totalQuestions=" + totalQuestions +
                '}';
    }
}
