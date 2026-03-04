#include <iostream>
using namespace std;

class box
{
    int length;
    int width;
    int height;

public:
    box(int length, int width, int height)
    {
        this->length = length;
        this->width = width;
        this->height = height;
    }

    void set_dimension(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }

    void compute_volume()
    {
        cout << length * width * height;
    }
};

int main()
{
    box b(0, 0, 0);
    b.set_dimension(10, 12, 15);
    b.compute_volume();
    return 0;
}

/*Why must initialization happen before assignment?
Ans : Because the when the object call immediatly constructor is called and  initialization happened.
  When is initialization preferred over assignment?
Ans: Initialization is preferred over assignment because it avoids unnecessary default construction and ensures proper initialization of const, reference, and object members
*/