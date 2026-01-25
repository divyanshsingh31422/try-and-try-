#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin >> T;
    while (T--) {
        int N;
        string S;
        cin >> N >> S;

        for (int i = 0; i < N; i += 2) {
            string p = S.substr(i, 2);
            if (p == "00") cout << 'A';
            else if (p == "01") cout << 'T';
            else if (p == "10") cout << 'C';
            else cout << 'G';
        }
        cout << '\n';
    }
    return 0;
}
