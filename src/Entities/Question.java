package Entities;

public class Question {

    private String question;
    private int questionNo;
    private boolean answered;
    public enum questionType {Dom,Inf,Sta,Com,PL,RI,CO,SH,ME,TW,IMP,CF,SP,DROP};
    public questionType type;

    public Question(){

    }

    Question(String question, int questionNo, questionType type){
        this.questionNo = questionNo;
        this.question = question;
        this.type = type;
    }

    int getQuestionNo() {
        return questionNo;
    }
    public void setQuestionNo(int No) {this.questionNo = No;}
    public String getQuestion(){
        return question;
    }
    public void setQuestion(String question) {this.question=question;}
    void setAnswered(boolean answer){
        this.answered=answer;
    }
    boolean getAnswered(){
        return answered;
    }
    public void setType(questionType type) {this.type = type;}
    questionType getType() {return type;}

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", questionNo=" + questionNo +
                ", answered=" + answered +
                ", type=" + type +
                '}';
    }
}
