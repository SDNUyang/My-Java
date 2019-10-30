#include<iostream>
#include<string.h>
using namespace std;
class Std
{
private:
	char* name;
	char id[10];
	int age;
	string adress;
public:
	Std();
	Std(char *r,char ID[10],int AGE,string ADRESS);
	Std(const Std& r);
	~Std();
	/*以上是构造函数于析构函数*/
	void Get();
	void Change();
	void disply();
};
/*..........类中函数的实现.........*/
Std::Std()
{
	cout << "无参构造函数被调用" << endl;
}
Std::Std(char* r, char ID[10], int AGE, string ADRESS)
{
	if (r != NULL)
	{
		int len = strlen(r);
		name = new char[len + 1];
		strcpy(name, r);
	}
	this->id[10] = ID[10];
	this->age = AGE;
	this->adress = ADRESS;
	cout << "有参构造函数被调用" << endl;
}
Std::Std(const Std& r)
{
	cout << "拷贝构造函数被调用" << endl;
	this->id[10] = r.id[10];
	this->age = r.age;
	this->adress = r.adress;
	if (r.name != NULL)
	{
		int len = strlen(r.name);
		this->name = new char[len + 1];
		strcpy(this->name, r.name);
	}
	cout << "拷贝构造函数被调用" << endl;


}
Std::~Std()
{
	cout << "析构函数被调用" << endl;
	delete[] name;
}
//以上是构造函数及析构函数的实现
/*..............接下来写普通函数..................*/
void Std::Get()                            //获取学生信息
{

}
void Std::Change()                       //修改学生信息
{

}
void Std::disply()
{
	cout << "学生姓名：" << name << endl;
	cout << "学生ID：  " << id << endl;
	cout << " 学生年龄： " << age << endl;
	cout << "学生住址：" << adress << endl;
}
int main()
{
	Std S;
	S.disply();

}