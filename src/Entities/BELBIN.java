package Entities;

import java.util.ArrayList;

import resources.BELBIN_Data;


/**
 * Created by Mathiaslarsen on 18/11/2016.
 */

public class BELBIN extends AbstractItem {
    public final int totalQuestions = 70;
    private int PL,RI,CO,SH,ME,TW,IMP,CF,SP,DROP;
    public static ArrayList<Question> questions;
    public static ArrayList<Question> oldQuestions;
    public static Question[] usedQuestions;
    public Question nextQuestion;
    public int completion;
    public boolean first1;
    public double price;
   

    public BELBIN(){
        PL = 0;
        RI = 0;
        CO = 0;
        SH = 0;
        ME = 0;
        TW = 0;
        IMP = 0;
        CF = 0;
        SP = 0;
        DROP = 0;
        initialize();
        convertQuestions();
    }

    public BELBIN(double cost, boolean isUsed, String productName, String description, testType type) {
        super(cost, isUsed, productName, description, type);
        PL = 0;
        RI = 0;
        CO = 0;
        SH = 0;
        ME = 0;
        TW = 0;
        IMP = 0;
        CF = 0;
        SP = 0;
        DROP = 0;
        this.Complete = getCompletion();
        initialize();
        convertQuestions();
    }

    public void setQuestions(ArrayList<Question> questions){
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions(){
        return this.questions;
    }

    public testType getTestType(){
        return super.getTestType();
    }
    public void setTestType(testType type){
        super.setTestType(type);
    }

    public void setDROP(int DROP) {
        this.DROP += DROP;
    }

    public void setSP(int SP) {
        this.SP += SP;
    }

    public void setCF(int CF) {
        this.CF += CF;
    }

    public void setIMP(int IMP) {
        this.IMP += IMP;
    }

    public void setTW(int TW) {
        this.TW += TW;
    }

    public void setME(int ME) {
        this.ME += ME;
    }

    public void setSH(int SH) {
        this.SH += SH;
    }

    public void setCO(int CO) {
        this.CO += CO;
    }

    public void setRI(int RI) {
        this.RI += RI;
    }

    public void setPL(int PL) {
        this.PL += PL;
    }

    public int getPL() {
        return PL;
    }

    public int getRI() {
        return RI;
    }

    public int getCO() {
        return CO;
    }

    public int getSH() {
        return SH;
    }

    public int getME() {
        return ME;
    }

    public int getTW() {
        return TW;
    }

    public int getIMP() {
        return IMP;
    }

    public int getCF() {
        return CF;
    }

    public int getSP() {
        return SP;
    }

    public int getDROP() {
        return DROP;
    }


    /********************************
     * The Belbin-test logic begins *
     *******************************/

    public void initialize(){

        oldQuestions = new ArrayList<>();
        questions = new ArrayList<>();
        for (int i = 0; i < totalQuestions; i++){
            questions.add(i,new Question(BELBIN_Data.BelbinWord_Data[i],BELBIN_Data.QuestionNo_DATA[i],BELBIN_Data.BELBINTYPE_Data[i]));
        }

    }



    /**********************************************************************
     * This method will get the next question from the stack of questions *
     **********************************************************************/

    public Question QUEUELOGIC(){


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


        return nextQuestion;
    }

    public Question QUEUELOGIC2(int index){
        if (!questions.isEmpty()){
            return questions.get(index);
        }
        else {
            return null;
        }
    }

    /**********************************************************
     * This method will set the score depending on the answer *
     **********************************************************/

    public void setScore(Question question,int score){

        switch(question.getType()){

            case PL:
                setPL(score);
                break;
            case RI:
                setRI(score);
                break;
            case CO:
                setCO(score);
                break;
            case SH:
               setSH(score);
                break;
            case ME:
                setME(score);
                break;
            case TW:
                setTW(score);
                break;
            case IMP:
                setIMP(score);
                break;
            case CF:
                setCF(score);
                break;
            case SP:
                setSP(score);
                break;
            case DROP:
                setDROP(score);
                break;

        }
    }

    /**********************************************************
     * This method returns the completion of the current test *
     **********************************************************/

    public int getCompletion(){

        return super.getCompletion();
    }

    /*************************************************
     * This method will	set the question as answered *
     *************************************************/

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
        int size = oldQuestions.size();
        calculateCompletion(totalQuestions,oldQuestions.get(size-1).getQuestionNo());
        getCompletion();
    }

    /***************************************************
     * This method calculates the completion of a test *
     ***************************************************/

    public void calculateCompletion(int totalQuestions, int currentQuestionNo ) {
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


    /******************************************
     * This method return the question number *
     ******************************************/

    public void convertQuestions(){
        usedQuestions = new Question[totalQuestions];
        for (int i = 0; i < totalQuestions; i++){
            usedQuestions[i] = questions.get(i);
        }
    }

    /****************************
     * The Belbin-test logic ends *
     ****************************/

    @Override
    public String toString() {
        return "BELBIN{}";
    }
}
