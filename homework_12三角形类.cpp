#include<iostream>
#include<cmath>
using namespace std;
class Trangle
{
private:
	double a;
	double b;
	double c;
public:
	Trangle(double n=0,double m=0,double p=0)//有参构造函数
	{
		a = n;
		b = m;
		c = p;

	}
	Trangle(const Trangle& r)//拷贝构造函数
	{
		this->a=r.a;
		this->b = r.b;
		this->c = r.c;
	}
	~Trangle()//析构函数！！！！！！！！必须要有完整的函数体，若只声明没有函数体在程序运行的时候会报错
	{

	}


	double Area()//求三角形的面积
	{
		double p;//半周长
		p = (a + b + c) / 2;
		double s;//面积
		s = sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	void Circulate()//求周长
	{
		double l;
		l = a + b + c;
		cout << "该三角形的周长为：" << l << endl;
	}




	Trangle operator+(Trangle &r)//重载“+”
	{
	
		return ((this->Area()) + r.Area());
	}
	
	Trangle operator=(Trangle &r)
	{
		this->a = r.a;
		this->b = r.b;

		this->c = r.c;
	}
	
	friend ostream& operator<<(ostream& out,Trangle  &r)
	{
		out << r.a;
		out << r.b;
		out << r.c;
		return out;
	}
};





//主函数
int main()
{
	Trangle T(1, 2, 1);
	Trangle A(3, 4, 5);
	double s1 = T.Area();
	T.Circulate();
	cout << "三角形T的面积为：" << s1 << endl ;



	Trangle B = T + A;
	double s2 = B.Area();
	//cout << s2 << endl;


	Trangle AA = T;//=重载成功
	AA.Circulate();
	cout << AA << endl;//<<重载成功
	return 0;
}