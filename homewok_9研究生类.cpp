#include<iostream>
#include<cstring>
using namespace std;
class greaduate
{
private:
	char* name;
	bool genderl;
	char* id;
	string research;
	string tutor;
	double score;
public:
	static int total;//共有的静态数据成员

	/*三构一析*/

	//greaduate() { total++; }

	greaduate(char* n, bool g,double sc, char *i, string r, string t);
	greaduate(const greaduate& g); 
	~greaduate();

	/*三构一析*/
	void Disply();
	void Disply()const;     //常成员函数，用来输出学生各项信息。
	friend void DisplyAverage(greaduate &,greaduate &);
	friend void DisplyRank(greaduate &);
};
int greaduate::total = 0;


/*
greaduate::greaduate()//无参构造函数
{
	name = NULL;
	cout << "***无参构造函数被调用***" << endl;
}

*/

greaduate::greaduate(char* n, bool g,double sc, char *i, string r, string t)//有参构造函数
{
	if (n)
	{
		name = new char[strlen(n) + 1];
		strcpy(name, n);
	}
	if (i)
	{
		id = new char[strlen(i) + 1];
		strcpy(id, i);
	}
	score = sc;
	strcpy(id, i);
	research = r;
	tutor = t;
}
greaduate::~greaduate()//析构函数
{
	if (name)
		delete[]name;
}
void greaduate::Disply()
{
	cout << "*学生姓名*" <<"  " ;
	cout << name<<endl;
	cout << "*  性别  *" << "  ";
	cout << genderl<<endl;
	cout << "*  学号  *" << "  ";
	cout << id<<endl;
	cout << "*入学成绩*" << "  ";
	cout << score << endl;
	cout << "*研究领域*" << "  ";
	cout << research << endl;
	cout << "*  导师  *" << "  ";
	cout << tutor << endl;
}
void greaduate::Disply()const
{
	cout << "*学生姓名*" << "  ";
	cout << name << endl;
	cout << "* 性别 *" << "  ";
	cout << genderl << endl;
	cout << "* 学号 *" << "  ";
	cout << id << endl;
	cout << "*入学成绩*" << "  ";
	cout << score << endl;
	cout << "*研究领域*" << "  ";
	cout << research << endl;
	cout << "* 导师 *" << "  ";
	cout << tutor << endl;
}

void DisplyAverage(greaduate&A,greaduate&B)    //输出平均成绩
{
	double sum, av;
	sum = A.score + B.score;
	av = sum / 2;
	cout << "*平均成绩*" << av << endl;
}

void DisplyRank(greaduate &A)
{
	cout << "*  等级  *"<<"  ";
	if (A.score >=90.0)
		cout << "A" << endl;
	if (A.score < 90.0 && A.score >=80.0)
		cout << "B" << endl;
	if (A.score < 80.0 && A.score >= 70.0)
		cout << "C" << endl;
	if (A.score < 70.0 && A.score >= 60.0)
		cout << "D" << endl;
	if(A.score<60.0)
		cout << "E" << endl;
}
int main()
{
	char na[] = "Zhang",nb[]="Wang";
	char i[] = "201811990127",i2[]="201811990136";
	greaduate A(na,false,60,i,"计算机","LiBai");
	greaduate B(nb, false, 90, i2, "计算机", "张大仙");
	A.Disply();
	DisplyRank(A);
	cout << endl << "************此处是分界线*************" << endl<<endl;
	B.Disply();

	DisplyRank(B);
	cout << "      " << endl;
	DisplyAverage(A, B);
	return 0;
}