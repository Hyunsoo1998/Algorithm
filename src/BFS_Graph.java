

//BFS는 일반적으로 Queue를 이용하여 구현한다 .

import java.util.LinkedList;
import java.util.Iterator;
public class BFS_Graph {

    private int V;
    private LinkedList<Integer> adj[]; // 링크드리스트의 배열

    // constructor
   BFS_Graph (int v) {
        V = v;
        adj = new LinkedList[v];
        // v개의 LinkedList 선언 및 생성
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }
    void addEdge (int v, int w) { // v번째 LinkedList 에 w를 삽입
        adj[v].add(w);
    }
    // DFS 함수
    void BFS(int s) {
        boolean visited[] = new boolean[V]; // 각 노드이 방문 여부를 저장하기 위해
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // 방문한 노드를 큐에서 추출하고 값을 출력
            s = queue.poll();
            System.out.println(s + " ");

            // 방문한 노드와 인접한 모든 노드를 가져온다.
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                // 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

/*3. DFS, BFS를 활용하면 좋은 상황

DFS와 BFS를 활용하면 좋은 상황으로는 아래와 같은 상황들이 있다.

(1) 그래프의 모든 정점을 방문하는 것이 주요한 문제: DFS, BFS 모두 무방하다.

(2) 경로의 특징을 저장해둬야 하는 문제: 각 장점에 숫자가 있고 a 부터 b까지 가는 경로를 구하는데 경로에 같은 숫자가 있으면 안된다는 문제 등,
 각각의 경로마다 특징을 저장해둬야 하는 경우는 DFS를 사용해야 한다. BFS는 경로의 특징을 저장하지 못한다.

(3) 최단거리를 구하는 문제: BFS가 유리하다. DFS의 경우 처음으로 발견되는 해답이 최단거리가 아닐 수 있지만 BFS의 경우 먼저 찾아지는 해답이
 곧 최단거리이기 때문이다.
* */