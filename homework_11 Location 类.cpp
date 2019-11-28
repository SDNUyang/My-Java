#include<iostream>
using namespace std;

//定义Location类
class Location
{
private:
	double x;
	double y;
public:
	Location(double a,double b)
	{
		x = a;
		y = b;
		//cout << "Location 构造函数被调用！" << endl;
	}
	~Location()
	{
		
	}
	void moveX()
	{
		x++;

	}
	void moveY()
	{
		y++;
	}
	double Getx()
	{
		return x;
	}
	double Gety()
	{
		return y;
	}
			
		
	
};

//派生类Point类
class Point:public Location
{
public:
	Point(double a, double b) :Location(a, b)
	{

	}
	~Point()
	{

	}
	double GetX()
	{
		double X;
		X = Getx();
		return X;
	}
	double GetY()
	{
		double Y;
		Y = Gety();
		return Y;
	}
	
	
};

//派生类Circle类
class Circle :public Point
{
private:
	double r;
public:
	Circle(double a,double b,double c): Point(a,b)
	{
		r = c;
	}
	~Circle()
	{

	}

	void CreateCircle()
	{
		double a, b;
		a = GetX();
		b = GetY();
		cout << "生成圆的标准方程为：(X-" << a << ")*(X-" << a << ")" << "+(Y-" << b << ")*(Y-" << b << ")=" << r * r << endl;
	}
	void show()
	{
		double a = GetX();
		double b = GetY();
		cout << "圆心坐标为：(" << a << "," << b << ")" << endl;
		cout << "圆的半径为：" << r << endl;
	}
	void move()
	{
		moveX();
		moveY();
	}
};

//主函数实现
int main()
{
	Circle C(1, 2, 3);
	C.show();//输出圆的圆心和坐标
	C.CreateCircle();//生成圆的标准方程
	C.moveX();//移动X坐标
	C.moveY();//移动Y坐标


	cout << "*********圆心移动********" << endl;
	C.show();//输出移动后的新的圆心坐标
	C.CreateCircle();//输出移动后的新的圆的标准方程



	//L.moveX();//移动X坐标位置
	//L.moveY();//移动Y坐标位置
	//double x = L.Getx();
	//double y = L.Gety();
	//cout << x << y << endl;
	system("pause");
}