#include <stdio.h>
#include <graphics.h>

struct point {
  int x, y, z;
};

void draw_line(struct point p1, struct point p2) {
  line(p1.x, p1.y, p2.x, p2.y);
}

void draw_cube(struct point p1, struct point p2) {
  draw_line(p1, p2);
  draw_line(p1, (struct point){p2.x, p1.y, p2.z});
  draw_line(p1, (struct point){p1.x, p2.y, p1.z});
  draw_line((struct point){p2.x, p1.y, p2.z}, (struct point){p2.x, p2.y, p2.z});
  draw_line((struct point){p2.x, p2.y, p2.z}, (struct point){p1.x, p2.y, p1.z});
  draw_line((struct point){p1.x, p2.y, p1.z}, (struct point){p1.x, p2.y, p2.z});
}

void oblique_projection(struct point *p) {
  p->x = p->x + p->z;
  p->y = p->y + p->z / 2;
}

int main() {
  int gd = DETECT, gm;
  initgraph(&gd, &gm, "C:\\TC\\BGI");

  struct point p1 = {100, 100, 100};
  struct point p2 = {200, 200, 200};

  oblique_projection(&p1);
  oblique_projection(&p2);

  draw_cube(p1, p2);

  getch();
  closegraph();

  return 0;
}
