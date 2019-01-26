#include <iostream>
#include <string>

using namespace std;

//Functions are declared//
double addition(double x,double y);
double subtraction (double x,double y);
double multiplication (double x,double y);
double division (double x,double y);
double powerfunc (double x, double y);
double squareroot (double x);
double factorial (double x);


int main(){
	double x =0,y =0;
	long double result=0;
	int Response;
	string Response2 ("empty");
	int abs = 0;

	do {
		cout<< "What mathematical operation do you want to perform?\n 1)addidtion\n 2)substraction\n 3)multiplication\n 4)division\n 5)Var1^Var2\n 6)sqrt of var 1\n 7)var1!"<<endl;
		cin >> Response;
		if (Response <= 7){
			cout<< "what is variable1?"<<endl;
			cin >> x;
			cout<< "what is variable 2?"<<endl;
			cin >> y;
			break;
		}
		else {
			cout<< "Invalid Option, try again." <<endl;
		}
	}while(Response > 7);

	do {
		cout<< "Do want the absolute value of the result? (yes or no)" <<endl;
		cin >> Response2;
		if (Response2.compare("yes") == 0) {
			abs = 1;
			break;
		}
		else if (Response2.compare("no") == 0) {
			abs = 0;
			break;
		}
		else {
			cout<< "Not a valid answer"<< endl;
		}
	}while (Response2.compare("yes") != 0 && Response2.compare("no") != 0);

	if (Response == 1) {
		result= addition(x,y);
	}
	else if (Response == 2) {
		result= subtraction(x,y);
	}
	else if (Response == 3) {
		result= multiplication(x,y);
	}
	else if (Response == 4) {
		result= division(x,y);
	}
	else if (Response == 5) {
		result= powerfunc(x,y);
	}
	else if (Response == 6){
		result = squareroot(x);
	}
	else{
		result = factorial(x);
	}

	if(abs ==1 && result >= 0) {
		result = result * 1;
	}
	else if (abs==1 && result <= 0) {
		result = result * -1;
	}

	cout << "The result is: "<<result <<endl;
	cout << "end of program"<<endl;
	return 0;
}


//The Rest are functions below this line//

double addition(double x,double y){
		double result;
		result = x+y;
		return result;
}
double subtraction (double x,double y){
		double result;
		result = x-y;
		return result;
}
double multiplication (double x,double y){
	double result;
	result = x*y;
	return result;
}
double division (double x,double y){
	double result;
	result = x/y;
	return result;
}
double powerfunc (double x, double y){
	double Y1=1;
	double Y2=y;
	double x1=x;
	if (x>=0){
		if (y==0){
			return 1;
		}
		else {
			while (Y1 < Y2) {
				x= x*x1;
				Y1++;
			}
		}
		return x;
	}
	else {
		cout<<"Domain Error"<<endl;
		return 0;
	}
}
double squareroot (double x) {
	double X1;
	double X2 = x/2;

	do {
		X1 = X2;
		X2 = (X1 + (x/X2))/2;
	}while((X2-X1) !=0);

	return X2;
}
double factorial (double x){
	double n1=x;
	double n2 = n1-1;
	
	if (x>0){
		while (n2 > 0){
			n1 = n1 * n2;
			n2--;
		}
		return n1;
	}
	else if (x==0){
		return 1;
	}
	else{
		cout<<"invalid input"<<endl;
		return 0;
	}
}
	
	
	