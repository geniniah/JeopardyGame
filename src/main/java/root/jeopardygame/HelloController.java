package root.jeopardygame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.*;
import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class HelloController {




    private Label welcomeText;
    public Button questionOne;
    public Button questionTwo,questionThree,questionFour,questionFive,questionSix,questionSeven,questionEight,questionNine;
    public Button questionTen,questionEle,questionTwel,questionThir,questionFourt;
    public Label displaySentence;
    public TextField answerEntered;
    public Button answerSubmitted;
    public Label scoreNumber;
    public Label questionNum;
    public int score = 0;
    public int tempScore;
    public Label commentLabel;


    @FXML
    protected void clearScore() {
        score = 0;
        String s = String.valueOf(score);
        scoreNumber.setText(s);
        displaySentence.setText(" ");
        answerEntered.setText("");
        commentLabel.setText(" ");
        questionOne.setDisable(false);
        questionTwo.setDisable(false);
        questionThree.setDisable(false);
        questionFour.setDisable(false);
        questionFive.setDisable(false);
        questionSix.setDisable(false);
        questionSeven.setDisable(false);
        questionEight.setDisable(false);
        questionNine.setDisable(false);
        questionTen.setDisable(false);
        questionEle.setDisable(false);
        questionTwel.setDisable(false);
        questionThir.setDisable(false);
        questionFourt.setDisable(false);

    }
    @FXML
    protected void submitButtonClicked() throws IOException{
        Answers answers = new Answers();
        answers.readAnswers();
      int x = Integer.parseInt(questionNum.getText());
      String a = answerEntered.getText();


      if (a.equalsIgnoreCase(answers.getAnswers(x))){
            score += tempScore;
            String s = String.valueOf(score);
            scoreNumber.setText(s);
            commentLabel.setText("Correct Answer!");
            answerEntered.setText("");
      }
      else {
          commentLabel.setText("Wrong Answer!");
          answerEntered.setText("");
      }


    }


    @FXML
    protected void questionOneClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(0));
        questionNum.setText("0");
        tempScore = 100;
        questionOne.setDisable(true);

        /*
        root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));

        Stage window = (Stage) questionOne.getScene().getWindow();
        window.setScene(new Scene(root,900,600));
           */

    }
    @FXML
    protected void questionTwoClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(1));
        questionNum.setText("1");
        tempScore = 100;
        questionTwo.setDisable(true);

    }
    @FXML
    protected void questionThreeClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(2));
        questionNum.setText("2");
        tempScore = 100;
        questionThree.setDisable(true);
    }
    @FXML
    protected void questionFourClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(3));
        questionNum.setText("3");
        tempScore = 100;
        questionFour.setDisable(true);

    }
    @FXML
    protected void questionFiveClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(4));
        questionNum.setText("4");
        tempScore = 200;
        questionFive.setDisable(true);

    }
    @FXML
    protected void questionSixClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(5));
        questionNum.setText("5");
        tempScore = 200;
        questionSix.setDisable(true);
    }
    @FXML
    protected void questionSevenClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(6));
        questionNum.setText("6");
        tempScore = 200;
        questionSeven.setDisable(true);

    }
    @FXML
    protected void questionEightClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(7));
        questionNum.setText("7");
        tempScore = 200;
        questionEight.setDisable(true);

    }
    @FXML
    protected void questionNineClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(8));
        questionNum.setText("8");
        tempScore = 300;
        questionNine.setDisable(true);

    }
    @FXML
    protected void questionTenClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(9));
        questionNum.setText("9");
        tempScore = 300;
        questionTen.setDisable(true);

    }
    @FXML
    protected void questionElevenClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(10));
        questionNum.setText("10");
        tempScore = 300;
        questionEle.setDisable(true);

    }
    @FXML
    protected void questionTwelveClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(11));
        questionNum.setText("11");
        tempScore = 300;
        questionTwel.setDisable(true);

    }
    @FXML
    protected void questionThirtClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(12));
        questionNum.setText("12");
        tempScore = 400;
        questionThir.setDisable(true);

    }
    @FXML
    protected void questionFourtClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(13));
        questionNum.setText("13");
        tempScore = 400;
        questionFourt.setDisable(true);

    }
    @FXML
    protected void questionFivtClicked() throws IOException{

        Questions questions = new Questions();
        questions.readQuestion();
        displaySentence.setText(questions.getQuestions(14));
        questionNum.setText("14");
        tempScore = 400;

    }










}

    class Questions {


        String dataline;
        private String[] listOfQuestions = new String[15];

        public void readQuestion() {
            try {

                File oneFile = new File("C:\\Users\\genin\\Documents\\JeopardyGame\\Jeopardy Questions and Answers\\JeopardyQuestionsAll.txt");

                Scanner scan = new Scanner(oneFile);

                int data = 0;
                while (scan.hasNextLine()) {
                    dataline = scan.nextLine();
                    listOfQuestions[data] = dataline;
                    data++;
                    if (data == 15)
                        break;

                }

                scan.close();


            }
            catch (IOException ioex) {
                System.out.println("Error: " + ioex.getMessage());

            }
        }

        public String getQuestions(int x){
            return listOfQuestions[x];
        }

    }




    class Answers {
        String dataline;
        private String[] listOfAnswers = new String[15];

        public void readAnswers(){
            try {

                File oneFile = new File("C:\\Users\\genin\\Documents\\JeopardyGame\\Jeopardy Questions and Answers\\JeopardyAnswersAll.txt");

                Scanner scan = new Scanner(oneFile);

                int data = 0;
                while (scan.hasNextLine()) {
                    dataline = scan.nextLine();
                    listOfAnswers[data] = dataline;
                    data++;
                    if (data == 15)
                        break;
                }

                scan.close();


            }
            catch (IOException ioex) {
                System.out.println("Error: " + ioex.getMessage());

            }
        }
        public String getAnswers(int x){
            return listOfAnswers[x];
        }

    }