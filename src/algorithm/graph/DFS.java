package algorithm.graph;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {

	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	public static void dfs(int x) {
		Stack<Integer> stack = new Stack<>();
		stack.add(x);
		visited[x] = true;

		while (!stack.isEmpty()) {
			int a = stack.pop();
			System.out.print(a + " ");
			for (int i = 0; i < graph.get(a).size(); i++) {
				if (!visited[graph.get(a).get(i)]) {
					visited[graph.get(a).get(i)] = true;
					stack.add(graph.get(a).get(i));
				}
			}
		}
		
		// result(방문순서) : 1 8 7 6 3 5 4 2
		
	}

	public static void main(String[] args) {
		/*
		 *    -----------------
		 *          Graph
		 *    -----------------
		 *    
		 *         1 --- 2
		 *        / \     \
		 *       3   \     7
		 *       |\   \  / |
		 *       4-5   8   6
		 */

		// 그래프 초기화
		for (int i = 0; i < 9; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// 노드1에 인접한 노드 저장
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);

		// 노드2에 인접한 노드 저장
		graph.get(2).add(1);
		graph.get(2).add(7);

		// 노드3에 인접한 노드 저장
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);

		// 노드4에 인접한 노드 저장
		graph.get(4).add(3);
		graph.get(4).add(5);

		// 노드5에 인접한 노드 저장
		graph.get(5).add(3);
		graph.get(5).add(4);

		// 노드6에 인접한 노드 저장
		graph.get(6).add(7);

		// 노드7에 인접한 노드 저장
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);

		// 노드8에 인접한 노드 저장
		graph.get(8).add(1);
		graph.get(8).add(7);

		dfs(1);
	}

}
