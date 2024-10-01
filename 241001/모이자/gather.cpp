#include <iostream>
using namespace std;

int main() {
    int n; // 집의 개수
    cin >> n;
    
    int people[n]; // 각 집에 사는 사람 수를 저장하는 배열
    int totalPeople = 0; // 총 사람 수 계산

    // 각 집에 사는 사람 수 입력 및 총 사람 수 계산
    for (int i = 0; i < n; i++) {
        cin >> people[i];
        totalPeople += people[i];
    }

    // 중앙값을 찾기 위해 필요한 위치
    int mid = (totalPeople + 1) / 2;

    // 중앙값 위치를 찾기 위한 변수
    int currentSum = 0;
    int optimalHouse = 0;

    // 중앙값을 기준으로 사람들의 이동 거리의 합이 최소가 되는 집을 찾음
    for (int i = 0; i < n; i++) {
        currentSum += people[i];
        if (currentSum >= mid) {
            optimalHouse = i + 1; // 집은 1부터 시작하므로 i + 1
            break;
        }
    }

    // 이동 거리의 합 계산
    long long totalDistance = 0;
    for (int i = 0; i < n; i++) {
        totalDistance += (long long)people[i] * abs(i + 1 - optimalHouse);
    }

    cout << totalDistance << endl;
    
    return 0;
}