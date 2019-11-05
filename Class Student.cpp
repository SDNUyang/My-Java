#include<iostream>
#include<cstring>
using namespace std;
/*....................定义一个学生类....................*/
class Std
{
private:
	char* name;                   //要用深拷贝    
	string id;
	int age;
	string adress;
public:
	Std();                                          //无参构造函数
	Std(char *name,string id,int age,string adress);       //有参构造函数
	Std(const Std &r);                              //拷贝构造函数
	~Std();                                         //析构函数
	/*以上是构造函数和析构函数*/
	void Get();
	void Change();
	void Disply();
};
/*..........类中函数的实现.........*/
Std::Std()
{
	cout << "无参构造函数被调用" << endl;
}
Std::Std(char* r, string i, int a, string ad)
{
	name = r;
	id = i;
	age = a;
	adress = ad;
	cout << "有参构造函数被调用" << endl;
}
Std::Std(const Std &r)
{
	cout << "拷贝构造函数被调用" << endl;
	this->id = r.id;                    //难受！！！！
	this->age = r.age;
	this->adress = r.adress;
	if (r.name != NULL)
	{
		int len = strlen(r.name);
		this->name = new char[len + 1];
		strcpy(this->name, r.name);
	}
	else this->name = 0;
	cout << "拷贝构造函数被调用" << endl;


}
Std::~Std()
{
	if(this->name)
	delete[] name;
	cout << "析构函数被调用" << endl;

}
//以上是构造函数及析构函数的实现
/*..............接下来写普通函数..................*/
void Std::Get()                            //获取学生信息
{
	cout << "学生姓名：" << endl;
	cin >>this->name;
	cout << "学生Id：";
	cin >> this->id;
	cout << "学生年龄：";
	cin >> this->age;
	cout << "学生住址：";
	cin >> this->adress;
}
void Std::Change()                       //修改学生信息
{

}
void Std::Disply()
{
	cout << "学生姓名：" << name << endl;
	cout << "学生ID: " << id << endl;
	cout << " 学生年龄： " << age << endl;
	cout << "学生住址：" << adress << endl;
}
int main()
{
	char name[] = "Zhangsan";
	Std S1(name,"201811990127",18,"01");
	//S1.Get();
	S1.Disply();
}