#include <stdio.h>
#include <limits.h>

#define MAX_MATRICES 100

int matrix_chain_multiplication(int dims[], int n) {
    int m[MAX_MATRICES][MAX_MATRICES];

    for (int i = 1; i <= n; i++) {
        m[i][i] = 0;
    }

    for (int chain_len = 2; chain_len <= n; chain_len++) {
        for (int i = 1; i <= n - chain_len + 1; i++) {
            int j = i + chain_len - 1;
            m[i][j] = INT_MAX;

            for (int k = i; k < j; k++) {
                int cost = m[i][k] + m[k + 1][j] + dims[i - 1] * dims[k] * dims[j];
                if (cost < m[i][j]) {
                    m[i][j] = cost;
                }
            }
        }
    }

    return m[1][n];
}

int main() {
    int n;

    printf("Enter the number of matrices: ");
    scanf("%d", &n);

    int dims[MAX_MATRICES];

    printf("Enter the dimensions of matrices: ");
    for (int i = 0; i <= n; i++) {
        scanf("%d", &dims[i]);
    }

    int result = matrix_chain_multiplication(dims, n);
    printf("Minimum number of scalar multiplications: %d\n", result);

    return 0;
}

