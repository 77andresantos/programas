#include <stdio.h>

int main()
{
    int pri, seg, ter, menor;

    printf("Primeiro valor: ");
    scanf("%d", &pri);
    printf("Segundo valor: ");
    scanf("%d", &seg);
    printf("Terceiro valor: ");
    scanf("%d", &ter);

    if (pri < seg && pri < ter) {
        menor = pri;
    }
    else if (seg < ter) {
        menor = seg;
    }
    else {
        menor = ter;
    }

    printf("MENOR = %d", menor);

    return 0;
}
