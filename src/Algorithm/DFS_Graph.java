package Algorithm;

import java.util.Iterator;
import java.util.LinkedList;
//  JAVA DFS 알고리즘 .
public class DFS_Graph {
    private int V;
    private LinkedList<Integer> adj[]; //링크드리스트의 배열

    //생성자
    public DFS_Graph(int v) {
        V= v;
        adj = new LinkedList[v];
        //v개의 LinkedList 선언 및 생성
        for(int i =0; i<v; ++i) {
            adj[i]=new LinkedList();
        }
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    //DFS 함수
    void DFS(int v) { //v를 시작노드로.
        boolean visited[]= new boolean[V]; // 각 노드의 방문여부를 저장하기 위해서
        DFSUtil(v,visited);

    }
    void DFSUtil(int v, boolean visited[]) {
        //현재 노드를 방문한 것으로 체크 (visited 의 v번째 요소를 true로)
        visited[v] =true;
        System.out.println(v+" ");

        //방문한 노드와 인접한 모든 노드를 가져온다.
        Iterator<Integer> it = adj[v].listIterator();


        while (it.hasNext()) {
            int n = it.next();
            // 방문하지 않은 노드면 해당 노드를 다시 시작 노드로하여 DFSUtil을 호출
            if (!visited[n])
                DFSUtil(n, visited); // 재귀호출!
        }
        }
    }