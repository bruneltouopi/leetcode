package org.leetcode.queue;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bruno-fabrice touopi
 */
public class TemplateBFS {

    /**
     * Return the length of the shortest path between root and target node.
     */
    int BFS(Node root, Node target) {
        Queue<Node> queue;  // store all nodes which are waiting to be processed
        int step = 0;       // number of steps neeeded from root to current node
        // initialize
        queue=new LinkedList<>();
        queue.add(root);
        // BFS
        while (!queue.isEmpty()) {
            // iterate the nodes which are already in the queue
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node cur = queue.peek();
                if (cur.isEqualNode(target)){
                    return step;
                }
             /*   for (Node next : ) {
                    queue.add(next);
                }*/
                //remove the first node from queue;
                queue.poll();
            }
            step = step + 1;
        }
        return -1;          // there is no path from root to target
    }
}
