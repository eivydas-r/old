//INFO: Project started 6/7/14, about 12PM.
//TODO: Invent calculator and interactions with Atlas.
#include "stdafx.h"
#include <iostream>
#include <string>
#include <Windows.h>
#include <cstdlib>
#include <time.h>
using namespace std;

string name;
string decision;
string command1 = "name";
string command2 = "2";
string command3 = "bank";
string command4 = "calculator";
string terraria = "terraria";

bool atlasTrust;
bool atlasLove; //InDev, don't question it
void randomNumber()
{
	//This is just so I remember the formula. Noob, right?
	//int x = rand() % 15 + 1;
	//int y = rand() % 74 + 2;
}
void startUp()
{
	cout << "---Hello, what is your name?\n\n///Name: ";
	cin >> name;
	cout << "\n---Hello, " << name << ", my name is Atlas.\n---You can think of me as your friend.";
	cout << "\n\n---What can I help you with today?";
}
void endMatrix()
{
	char f;
	cin >> f;
	abort();
}
void helpFunction()
{
	cout << "\n//-File Commands:\n--name\n--2\n--bank\n--calculator\n\n//-System Commands:\n--help\n--end\n";
	if (atlasTrust == true)
	{
		cout << "\n//-Secret Commands:\n--terraria";
	}
}
void endFunction()
{
	cout << "\n/!/Are you sure?\n/!/Type 'end' again to confirm or type something to cancel.\n\n///Decision: ";
	string confirmation;
	cin >> confirmation;
	if (confirmation == "end")
	{
		exit(1);
	}
	else if (confirmation == "something") //Start Easter egg
	{
		cout << "\n---You're a clever little species, aren't you, " << name << "?\n\n";
		Sleep(2000);
		cout << "Well, I bet you can't answer this mathematical problem.\n";
		Sleep(4000);
		int x = rand() % 151 + 1;
		int y = rand() % 74 + 182;
		cout << x << " + " << y << " = ";
		int answer;
		cin >> answer;
		if (answer == (x + y))
		{
			cout << "---Congratulations, you beat a simple addition problem, and you found your way here."; Sleep(2000); cout << "\n---I'm impressed, " << name; Sleep(2000); cout << "\n---You have gained my trust.";
			atlasTrust = true; //Yay!
			Sleep(2000);
			cout << "\n\n/!/You now have secret things unlocked.\n/!/This is still in development.";
		}
		else
		{
			cout << "\n\n---Sorry, I guess you're just not intelligent enough for me to trust.";
			cout << "\n\n/!/You missed your chance to impress Atlas.";
		}


	}
}
void command1Function()
{
	cout << "\nYour name is " << name << ", I'd never forget.";
}
void command2Function()
{
	cout << "\nSuccess 2.";
}
int  bankCommandFunction() //FIX THIS SHIT
{   //Virtual Console Bank 1.4, original started and finished 6/4/2014.
	//Updated and converted to string commands from char commands on 6/7/2014, about 2:00PM.
	void consoleBankCredits(); //Hide the credits to save viewing space as much as you can. This function isn't functional.
	{
		/*__________________________________________________________________________\
		| ____                       _       ______             _      __   _____   |
		/  __ \                     | |      | ___ \           | |    /  | |  _  |  |
		| /  \/ ___  _ __  ___  ___ | | ___  | |_/ / __ _ _ __ | | __ `| | | |/' |  |
		| |    / _ \| '_ \/ __|/ _ \| |/ _ \ | ___ \/ _` | '_ \| |/ /  | | |  /| |  |
		| \__/\ (_) | | | \__ \ (_) | |  __/ | |_/ / (_| | | | |   <  _| |_\ |_/ /  |
		\____/\___/|_| |_|___/\___/|_|\___| \____/ \__,_|_| |_|_|\_\ \___(_)___/   |
		|___________________________________________________________________________|
		|INFO: This C++ script was make by CoolDudeRuler on Wednesday, June 4th,    |
		|2014. I started this script after I learned the basics of C++ and thought  |
		|it would be a lot of fun. I would of never guessed that it would of taken  |
		|me until 10:00PM at night to actually finish it. It turned out to be a lot |
		|of fun, and I loved the feeling of solving a really tough bug. By the time |
		|I type this, it's my second actual day of learning C++. I feel				|
		|accomplished. Don't you just love this crappy ASCII art I felt like		|
		|randomly making? I don't mind it as of now.								|
		|																			|
		|PURPOSE: I felt like making this C++ script as a fun little project while  |
		|I was learning C++. It's meant to be for fun, and as a sort of simulator,  |
		|which could actually hold actual information if I ever figure out how to	|
		|hold lasting information so that it would be an actual bank. I think of	|
		|this as a good way to keep in track of your money instead of using a bank	|
		|site or Excel, but those would probably work out better. This was fun.		|
		\__________________________________________________________________________*/
	}

		unsigned long int depositAmount;
		unsigned long int withdrawAmount;
		unsigned long int userBalance = 0;
		char terminate;
		string decision;

		cout << "\n/!/Atlas and commands are unavailable in this program.\n\n"; //Updated to let user know.

		cout << "Welcome to the Console Bank 1.4\n\nWhat would you like to do today?\n\n";
		cout << "Commands:\nType 'deposit' to deposit money\nType 'withdraw' to withdraw money\nType 'balance' to check your balance\nType 'exit' to exit the Console Bank\n\n";
		cout << "Your decision: "; //The "1.4" in "Console Bank 1.4" stands for the 4 different command char values that were changed into the 4 new different command strings.

	decision:

		cin >> decision; //Wait for answer

		if (decision == "deposit") //Checks if 'd' //Changed 6/7/2014, about 2:00PM.
		{
			cout << "\nHow much money would you like to deposit?\nDeposit: ";
			cin >> depositAmount;
			if (depositAmount > 2147483647)
			{
				cout << "\nERROR: Invalid transaction. You can't deposit more than 2147483647 at a time.";
				goto decision2;
			}
			else
			{
				cout << "\nYou just deposited $";
				cout << depositAmount;
				cout << ". \n\n";

				userBalance = (depositAmount + userBalance);
				goto decision2;
			}
		}

		else if (decision == "withdraw") //Changed 6/7/2014, about 2:00PM.
		{
			cout << "\nHow much money would you like to withdraw?\nWithdraw: ";
			cin >> withdrawAmount;
			if (withdrawAmount > userBalance)
			{
				cout << "\nERROR: Invalid transaction. You can't withdraw more than your total balance.\n";
				goto decision2;
			}
			else
			{
				cout << "You just withdrew $";
				cout << withdrawAmount;
				cout << ". \n\n";

				userBalance = (userBalance - withdrawAmount);
				goto decision2;
			}
		}


		else if (decision == "balance") //Changed 6/7/2014, about 2:00PM.
		{
			cout << "\nYour bank account balance is: $";
			cout << userBalance;
			cout << endl;
			cout << endl;
		}

		else if (decision == "exit") //Changed 6/7/2014, about 2:00PM.
		{
			cout << "\n\nAre you sure?\nType 'exit' again to confirm this action.\nConfirmation: ";
			cin >> terminate;
			if (terminate == 'exit')
			{
				goto destroy;
			}
		}

		else //Take down
		{
			cout << "\nYou have chosen an unavailable or undeveloped choice.\n";
			goto decision2;
		}

	decision2:

		cout << "\nWhat would you like to do now?\nYour decision: ";
		goto decision;

		destroy:

		char bankend; //Changed 6/7/2014, about 2:00PM because of ambiguous errors, too lazy to change back.
		cin >> bankend; //Changed 6/7/2014, about 2:00PM because of ambiguous errors, too lazy to change back.

		return 0;
} 
void calculatorCommandFunction()
{
	cout << "\nCalculator is in development.";
}
void terrariaFunction()
{
	cout << "       8  welcome to terraria   \n";
	cout << "      888       O -tklmipikl    \n";
	cout << "       |       /|>      	     \n";
	cout << "_______|________M_______________\n";
	cout << "Isn't this just beautiful?";
}
void command() //Program main function
{
	cout << "\n\n///Command: ";
	cin >> decision;
	if (decision == command1)
	{
		command1Function();
	}
	else
	if (decision == command2)
	{
		command2Function();
	}
	else
	if (decision == command3)
	{
		bankCommandFunction();
	}
	else
	if (decision == command4)
	{
		calculatorCommandFunction();
	}
	else
	if (decision == terraria)
	{
		terrariaFunction();
	}

	else
	if (decision == "help")
	{
		helpFunction();
	}
	else
	if (decision == "end")
	{
		endFunction();
	}
	else
	{
		cout << "\n/!/Invalid command, type 'help' for help.";
	}
}

int main()
{
	startUp();

decision:

	command();

goto decision;






endMatrix();
}
