#include<iostream>
using namespace std;
//            定义一个基类
class Base
{
public:
	int a;
	static int count;
	void print()
	{
		cout << "a=" << a << endl;
		cout << "b=" << b << endl;
		cout << "c=" << c << endl;
	}
	static int statistic()
	{
		count++;
		return count;
	}

protected:
	int b;
private:
	int c;
};

//派生类1
class pai1 :public Base
{


};

//派生类2
class pai2:protected Base
{

};

//派生类3
class pai3
{

};
int main()
{
	pai1 P;
	pai2 O;
	cout << "P的大小为：" << sizeof(P) << endl;
	cout << "O的大小为：" << sizeof(O) << endl;

	system("pause");
}