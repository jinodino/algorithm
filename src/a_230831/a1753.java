package a_230831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    int v, w;

    public Node(int v, int w){
        this.v = v; // 도착지
        this.w = w; // 가중치
    }

    @Override
    public int compareTo(Node n){
        return this.w - n.w;
    }
}

public class a1753 {
	
	public static int v, e;
	
	private static int INF = Integer.MAX_VALUE;
	
	public static ArrayList<Node>[] graph;
	public static boolean[] visited;
	public static int[] dist;
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        dist = new int[v + 1];         //시작점과 다른 정점간의 최단경로
        graph = new ArrayList[v + 1];  //정점 인접리스트
        int start = Integer.parseInt(br.readLine());

        for (int i = 1; i <= v; i++) {
        	graph[i] = new ArrayList<>();
        }
        
        Arrays.fill(dist, INF);
        dist[start] = 0;
        
        for (int i = 0 ; i < e; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	int u = Integer.parseInt(st.nextToken()); // 출발지
        	int v = Integer.parseInt(st.nextToken()); // 도착지
        	int w = Integer.parseInt(st.nextToken()); // 가중치
        	
        	graph[u].add(new Node(v, w));
        }
        
        dijkstra(start);
        
        for (int i = 1; i <= v; i++) {
            if (dist[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
  
    }
	
	public static void dijkstra(int start)
	{
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		
		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int vertex = node.v;
            int weight = node.w;
            System.out.println(vertex + "!!" + weight);
            if (dist[vertex] < weight) { //지금께 더 가중치가 크면 갱신할 필요가 없다.
                continue;
            }
            
            for (int i = 0; i < graph[vertex].size(); i++) {//해당 정점과 연결된 것들 탐색
                int vertex2 = graph[vertex].get(i).v;
                int weight2 = graph[vertex].get(i).w + weight;
                if (dist[vertex2] > weight2) { //지금께 더 최단경로라면 갱신해준다.
                	System.out.println(vertex2 + "@@" + weight2);
                    dist[vertex2] = weight2;
                    pq.add(new Node(vertex2, weight2));
                }
            }
		}
	}


}
