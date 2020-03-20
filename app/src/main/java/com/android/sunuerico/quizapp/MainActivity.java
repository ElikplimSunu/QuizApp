package com.android.sunuerico.quizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	int score = 0;

	//This method is called when the Submit button is clicked
	public void submitAnswers(View view) {
		score = 0;

		//Referencing the various correct answers to the question
		RadioButton question1RadioButton = findViewById(R.id.question1_a);
		boolean correctQuestion1 = question1RadioButton.isChecked();

		RadioButton question2RadioButton = findViewById(R.id.question2_c);
		boolean correctQuestion2 = question2RadioButton.isChecked();

		RadioButton question3RadioButton = findViewById(R.id.question3_c);
		boolean correctQuestion3 = question3RadioButton.isChecked();

		RadioButton question4RadioButton = findViewById(R.id.question4_d);
		boolean correctQuestion4 = question4RadioButton.isChecked();

		EditText question5EditText = findViewById(R.id.question5_edit_text);
		String correctQuestion5 = question5EditText.getText().toString();

		CheckBox question6CheckBoxA = findViewById(R.id.question6_a);
		boolean correctQuestion6a = question6CheckBoxA.isChecked();

		CheckBox question6CheckBoxB = findViewById(R.id.question6_b);
		boolean correctQuestion6b = question6CheckBoxB.isChecked();

		CheckBox question6CheckBoxC = findViewById(R.id.question6_c);
		boolean correctQuestion6c = question6CheckBoxC.isChecked();

		CheckBox question6CheckBoxD = findViewById(R.id.question6_d);
		boolean correctQuestion6d = question6CheckBoxD.isChecked();

		CheckBox question6CheckBoxE = findViewById(R.id.question6_e);
		boolean correctQuestion6e = question6CheckBoxE.isChecked();

		CheckBox question6CheckBoxF = findViewById(R.id.question6_f);
		boolean correctQuestion6f = question6CheckBoxF.isChecked();

		EditText question7EditText = findViewById(R.id.question7_edit_text);
		String correctQuestion7 = question7EditText.getText().toString();

		CheckBox question8CheckBoxA = findViewById(R.id.question8_a);
		boolean correctQuestion8a = question8CheckBoxA.isChecked();

		CheckBox question8CheckBoxB = findViewById(R.id.question8_b);
		boolean correctQuestion8b = question8CheckBoxB.isChecked();

		CheckBox question8CheckBoxC = findViewById(R.id.question8_c);
		boolean correctQuestion8c = question8CheckBoxC.isChecked();

		CheckBox question8CheckBoxD = findViewById(R.id.question8_d);
		boolean correctQuestion8d = question8CheckBoxD.isChecked();

		CheckBox question8CheckBoxE = findViewById(R.id.question8_e);
		boolean correctQuestion8e = question8CheckBoxE.isChecked();

		calculateScore(correctQuestion1, correctQuestion2, correctQuestion3, correctQuestion4, correctQuestion5,
				correctQuestion6a, correctQuestion6b, correctQuestion6c, correctQuestion6d, correctQuestion6e,
				correctQuestion6f, correctQuestion7, correctQuestion8a, correctQuestion8b, correctQuestion8c,
				correctQuestion8d, correctQuestion8e);

		String scoreMessage1 = "You scored " + score + " out of 8. Good Job :)";
		String scoreMessage2 = "You scored " + score + " out of 8. I believe you can do better :)";

		if (score <= 5) {
			Toast.makeText(this, scoreMessage2, Toast.LENGTH_LONG).show();
		}

		if (score > 5) {
			Toast.makeText(this, scoreMessage1, Toast.LENGTH_LONG).show();
		}

	}


	//This method adds the scores assigns colours to the wrong or correct answers
	public void calculateScore(boolean correctQuestion1Answer, boolean correctQuestion2Answer,
	                           boolean correctQuestion3Answer, boolean correctQuestion4Answer,
	                           String correctQuestion5Answer, boolean correctQuestion6aAnswer,
	                           boolean correctQuestion6bAnswer, boolean correctQuestion6cAnswer,
	                           boolean correctQuestion6dAnswer, boolean correctQuestion6eAnswer,
	                           boolean correctQuestion6fAnswer, String correctQuestion7Answer,
	                           boolean correctQuestion8aAnswer, boolean correctQuestion8bAnswer,
	                           boolean correctQuestion8cAnswer, boolean correctQuestion8dAnswer,
	                           boolean correctQuestion8eAnswer
	) {

		if (correctQuestion1Answer) {
			score += 1;

			RadioButton question1RadioButton = findViewById(R.id.question1_a);
			question1RadioButton.setTextColor(Color.GREEN);
		} else {
			RadioGroup question1RadioGroup = findViewById(R.id.question1_radio_buttons);
			int selectedId = question1RadioGroup.getCheckedRadioButtonId();

			RadioButton question1RadioButton = findViewById(selectedId);
			question1RadioButton.setTextColor(Color.RED);
		}


		if (correctQuestion2Answer) {
			score += 1;

			RadioButton question2RadioButton = findViewById(R.id.question2_c);
			question2RadioButton.setTextColor(Color.GREEN);
		} else {
			RadioGroup question2RadioGroup = findViewById(R.id.question2_radio_buttons);
			int selectedId = question2RadioGroup.getCheckedRadioButtonId();

			RadioButton question2RadioButton = findViewById(selectedId);
			question2RadioButton.setTextColor(Color.RED);
		}


		if (correctQuestion3Answer) {
			score += 1;

			RadioButton question3RadioButton = findViewById(R.id.question3_c);
			question3RadioButton.setTextColor(Color.GREEN);
		} else {
			RadioGroup question3RadioGroup = findViewById(R.id.question3_radio_buttons);
			int selectedId = question3RadioGroup.getCheckedRadioButtonId();

			RadioButton question3RadioButton = findViewById(selectedId);
			question3RadioButton.setTextColor(Color.RED);
		}


		if (correctQuestion4Answer) {
			score += 1;

			RadioButton question4RadioButton = findViewById(R.id.question4_c);
			question4RadioButton.setTextColor(Color.GREEN);
		} else {
			RadioGroup question4RadioGroup = findViewById(R.id.question4_radio_buttons);
			int selectedId = question4RadioGroup.getCheckedRadioButtonId();

			RadioButton question4RadioButton = findViewById(selectedId);
			question4RadioButton.setTextColor(Color.RED);
		}

		if (correctQuestion5Answer.equals("onCreate()") || correctQuestion5Answer.equals("onCreate();")) {
			score += 1;

			EditText question5EditText = findViewById(R.id.question5_edit_text);
			question5EditText.setTextColor(Color.GREEN);
		} else {
			EditText question5EditText = findViewById(R.id.question5_edit_text);
			question5EditText.setTextColor(Color.RED);
		}

		if (correctQuestion6aAnswer && correctQuestion6bAnswer && correctQuestion6dAnswer
				&& correctQuestion6fAnswer && !correctQuestion6cAnswer && !correctQuestion6eAnswer) {
			score += 1;

			CheckBox question6aCheckBox = findViewById(R.id.question6_a);
			question6aCheckBox.setTextColor(Color.GREEN);

			CheckBox question6bCheckBox = findViewById(R.id.question6_b);
			question6bCheckBox.setTextColor(Color.GREEN);

			CheckBox question6dCheckBox = findViewById(R.id.question6_d);
			question6dCheckBox.setTextColor(Color.GREEN);

			CheckBox question6fCheckBox = findViewById(R.id.question6_f);
			question6fCheckBox.setTextColor(Color.GREEN);

		} else {
			if (correctQuestion6cAnswer) {
				CheckBox question6cCheckBox = findViewById(R.id.question6_c);
				question6cCheckBox.setTextColor(Color.RED);
			}


			if (correctQuestion6eAnswer) {
				CheckBox question6eCheckBox = findViewById(R.id.question6_e);
				question6eCheckBox.setTextColor(Color.RED);
			}
		}

		if (correctQuestion7Answer.equals("RelativeLayout")) {
			score += 1;

			EditText question7EditText = findViewById(R.id.question7_edit_text);
			question7EditText.setTextColor(Color.GREEN);
		} else {
			EditText question7EditText = findViewById(R.id.question7_edit_text);
			question7EditText.setTextColor(Color.RED);
		}

		if (correctQuestion8cAnswer && correctQuestion8eAnswer && !correctQuestion8aAnswer &&
				!correctQuestion8bAnswer && !correctQuestion8dAnswer) {
			score += 1;

			CheckBox question8cCheckBox = findViewById(R.id.question8_c);
			question8cCheckBox.setTextColor(Color.GREEN);

			CheckBox question8eCheckBox = findViewById(R.id.question8_e);
			question8eCheckBox.setTextColor(Color.GREEN);
		} else {
			if (correctQuestion8aAnswer) {
				CheckBox question8aCheckBox = findViewById(R.id.question8_a);
				question8aCheckBox.setTextColor(Color.RED);
			}


			if (correctQuestion8bAnswer) {
				CheckBox question8bCheckBox = findViewById(R.id.question8_b);
				question8bCheckBox.setTextColor(Color.RED);
			}


			if (correctQuestion8dAnswer) {
				CheckBox question8dCheckBox = findViewById(R.id.question8_d);
				question8dCheckBox.setTextColor(Color.RED);
			}
		}

	}


	//This method is called when the Start Over button is clicked and it Initializes the activity
	public void startOver(View view) {

		finish();
		startActivity(getIntent());
	}

	//This method is called when the Show Answers button is clicked
	public void showAnswers(View view) {
		RadioButton question1Answer = findViewById(R.id.question1_a);
		question1Answer.setChecked(true);

		RadioButton question2Answer = findViewById(R.id.question2_c);
		question2Answer.setChecked(true);

		RadioButton question3Answer = findViewById(R.id.question3_c);
		question3Answer.setChecked(true);

		RadioButton question4Answer = findViewById(R.id.question4_d);
		question4Answer.setChecked(true);

		EditText question5Answer = findViewById(R.id.question5_edit_text);
		question5Answer.setText("onCreate();");

		clearCheckedIncorrect();

		CheckBox question6Answer1 = findViewById(R.id.question6_a);
		question6Answer1.setChecked(true);

		CheckBox question6Answer2 = findViewById(R.id.question6_b);
		question6Answer2.setChecked(true);

		CheckBox question6Answer3 = findViewById(R.id.question6_d);
		question6Answer3.setChecked(true);

		CheckBox question6Answer4 = findViewById(R.id.question6_f);
		question6Answer4.setChecked(true);

		EditText question7Answer = findViewById(R.id.question7_edit_text);
		question7Answer.setText("RelativeLayout");

		CheckBox question8Answer1 = findViewById(R.id.question8_c);
		question8Answer1.setChecked(true);

		CheckBox question8Answer2 = findViewById(R.id.question8_e);
		question8Answer2.setChecked(true);

	}

	/**
	 * This method clears the selected checkboxes that are incorrect
	 */
	public void clearCheckedIncorrect() {

		//This references to the checkbox containing the incorrect answer.
		CheckBox question6CheckBoxC = findViewById(R.id.question6_c);
		boolean incorrectQuestion6c = question6CheckBoxC.isChecked();


		//This clears any incorrect answer to the question 6 checkboxes
		//before displaying the correct answer.
		if (incorrectQuestion6c) {
			question6CheckBoxC.setChecked(false);
		}

		//This references to the checkbox containing the incorrect answer.
		CheckBox question6CheckBoxE = findViewById(R.id.question6_e);
		boolean incorrectQuestion6e = question6CheckBoxE.isChecked();


		//This clears any incorrect answer to the question 6 checkboxes
		//before displaying the correct answer.
		if (incorrectQuestion6e) {
			question6CheckBoxE.setChecked(false);
		}

		//This references to the checkbox containing the incorrect answer.
		CheckBox question8CheckBoxA = findViewById(R.id.question8_a);
		boolean incorrectQuestion8a = question8CheckBoxA.isChecked();


		//This clears any incorrect answer to the question 8 checkboxes
		//before displaying the correct answer.
		if (incorrectQuestion8a) {
			question8CheckBoxA.setChecked(false);
		}

		//This references to the checkbox containing the incorrect answer.
		CheckBox question8CheckBoxB = findViewById(R.id.question8_b);
		boolean incorrectQuestion8b = question8CheckBoxB.isChecked();


		//This clears any incorrect answer to the question 8 checkboxes
		//before displaying the correct answer.
		if (incorrectQuestion8b) {
			question8CheckBoxB.setChecked(false);
		}

		//This references to the checkbox containing the incorrect answer.
		CheckBox question8CheckBoxD = findViewById(R.id.question8_d);
		boolean incorrectQuestion8d = question8CheckBoxD.isChecked();


		//This clears any incorrect answer to the question 8 checkboxes
		//before displaying the correct answer.
		if (incorrectQuestion8d) {
			question8CheckBoxD.setChecked(false);
		}
	}


}
