#include<iostream>
#include<stdlib.h>
#include<cmath>
#include<ctime>

#define RAND_MAX 2147483647
using namespace std;


class school
{
private:
	string name;
	string address;
public:
	school(string x,string aa)
	{
		this->name = x;
		this->address = aa;
	}
	void Disp()
	{
		cout << " 学校   ：    " << name << endl;
		cout << " 地址   ：    " << address << endl;
	}
};



class date
{
private:
	int year;
	int month;
	int day;
public:
	date(int x,int y,int z)
	{
		year = x;
		month = y;
		day = z;
	}
	int GetYear()
	{
		return year;
	}
	int GetMoth()
	{
		return month;
	}
	int GetDay()
	{
		return day;
	}
	void Disp()
	{
		cout << year << "-" << month << "-" << day << endl;
	}
};


class Student
{
private:

	school s;                     //学校成员类
	date a;                       //日期成员类
	string name;
	string sex;
	string id;
	double GDA;
	
public:
	static int total;
	Student(string s,string add,int year,int month,int day,string na,string se,string i,double GD) :s(s,add), a(year, month, day)
	{
		this->name = na;
		this->sex = se;
		this->id = i;
		this->GDA = GD;
		total++;
	}
	void DispInf(Student &A)const
	{
		cout << "****************基本信息****************"<<endl;
		cout << " 姓名   ：  " << A.name << endl;
		int age,ThisYear=2019;
		age = ThisYear - A.a.GetYear();
		cout << " 年龄   ：" << "    " << age << endl;
		cout << " 学号   ：" << "  " << id << endl;
		cout << " 绩点   ：" << "  " << GDA << endl;

		cout << "出生日期：" << "  ";
		A.a.Disp();
		cout << "****************基本信息****************" << endl<<endl;
		cout << "****************学校信息****************" << endl;
		A.s.Disp();
		cout << "****************学校信息****************" << endl;
	}
	
};
int Student::total = 0;


/*................以上是类的定义与声明..............*/


int main()
{
	srand((double)time(0));
	double d=(rand() / RAND_MAX) % (4-0) + 0;
	Student A("SDNU","山东省济南市长清区大学路一号 ",2000,12,2,"ZhangSan","男","201811990127",d);
	Student B("SDNU","山东省济南市长清区大学路一号 ",2001,12,3,"WangWu","男","201811990139",d);
	A.DispInf(A);
	B.DispInf(B);

	cout <<"学生个数："<< Student::total << endl;

	system("pause");
}