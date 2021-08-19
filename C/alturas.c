#include <stdio.h>
#include <stdlib.h>

int main()
{
    int N, nmenores;
    double soma, media, pMenores;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);

    char nomes[N][50];
    int idades[N];
    double alturas[N];

    for (int i = 0; i < N; i++) {
        printf("Dados da %da pessoa\n", i + 1);
        printf("Nome: ");
        fseek(stdin, 0, SEEK_END);
        gets(nomes[i]);
        printf("Idade: ");
        scanf("%d", &idades[i]);
        printf("Altura: ");
        scanf("%lf", &alturas[i]);
    }

    soma = 0;
    for (int i = 0; i < N; i++) {
        soma = soma + alturas[i];
    }
    printf("\n");
    media = soma / N;
    printf("Altura media: %.2lf\n", media);

    nmenores = 0;
    for (int i = 0; i < N; i++) {
        if (idades [i] < 16) {
            nmenores++;
        }
    }
    pMenores = (double) nmenores * 100 / N;
    printf("Pessoas com menos de 16 anos: %.1lf %%\n", pMenores);

    for (int i = 0; i < N; i++) {
        if (idades[i] < 16) {
            printf("%s\n", nomes[i]);
        }
    }

    return 0;
}
