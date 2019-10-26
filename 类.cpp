#include<iostream>
#include<cmath>
using namespace std;
class Triangle
{
private :
	int a;
	int b;
	int c;
public:
	/*构造函数赋初值办法
	Triangle(int x, int y, int z)
	{
		this->a = x;
		this->b = y;
		this->c = z;
	}
	*/
	int Judge();/*判断能否构成三角形*/
	int Caculate_l();/*计算三角形的周长*/
	float Caculate_s();/*计算三角形的面积*/
	void Judge_form();/*判断三角形的类型*/
	void SetDate(int,int ,int);/*初始化*/
};
void Triangle::SetDate(int x, int y, int z)
{
	a = x;
	b = y;
	c = z;
}
int Max(int a, int b, int c)
{
	if (a > b&& a > c)
		return a;
	if (b > a&& b > c)
		return b;
	if (c > a&& c > b)
		return c;
}
int Triangle::Judge()
	{
	if (c >= a + b || a >= b + c || b >= a + c)
	{
		cout << "这三条边不能构成三角形！" << endl;
		return 0;
	}
	else
	{
		cout << "这三条边可以构成三角形" << endl;
		return 1;
	}
	}
int Triangle::Caculate_l()
{
	return a + b + c;
}
float Triangle::Caculate_s()
{
	float p,s;
	p = (a + b + c) / 2;
	s = sqrt(p * (p - a) * (p - b) * (p - c));
	return s;
}
void Triangle::Judge_form()
{
	int max;
	max = Max(a, b, c);
	if (max == a)
	{
		if (max * max > (b * b + c * c))
			cout << "此三角形为钝角三角形" << endl;
		if (max * max < (b * b + c * c))
			cout << "此三角形为锐角三角形" << endl;
		if (max * max == (b * b + c * c))
			cout << "此三角形为直角三角形" << endl;
	}
	if (max == b)
	{
		if (max * max > (a * a + c * c))
			cout << "此三角形为钝角三角形" << endl;
		if (max * max < (a * a + c * c))
			cout << "此三角形为锐角三角形" << endl;
		if (max * max == (a * a + c * c))
			cout << "此三角形为直角三角形" << endl;
	}
	if (max == c)
	{
		if (max * max > (a * a + b * b))
			cout << "此三角形为钝角三角形" << endl;
		if (max * max < (a * a + b * b))
			cout << "此三角形为锐角三角形" << endl;
		if (max * max == (a * a + b* b))
			cout << "此三角形为直角三角形" << endl;
	}
}
int main()
{
	Triangle A,B,*p,*j;
	int x,y, z;
	p = &A;
	j = &B;
	int l;
	float s;
	cout << "对象A的地址为：" << p << endl;
	cout << "对象B的地址为：" << j << endl;
	cout << "对象A的大小为：" << sizeof(A) << endl;
	cout << "请输入三条边a,b,c的值：" << endl;
	cin >> x >> y >> z;
	A.SetDate(x,y,z);
	int J;
	J = A.Judge();
	{	if (J == 0)
			return 0;
		else 
		{
			cout << "该三角形的周长为：";
			p = &A;
			(*p).SetDate(x, y, z);
			l = A.Caculate_l();
			cout << l << endl;
			cout << "该三角形的面积为：";
			(*p).SetDate(x, y, z);
			s = A.Caculate_s();
			cout << s << endl;
			(*p).SetDate(x, y, z);
			A.Judge_form();
			return 0;
		}
	}
	
}