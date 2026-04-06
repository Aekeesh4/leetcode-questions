class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;
        
        // Map each stop to the list of routes that pass through it
        Map<Integer, List<Integer>> stopToRoutes = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                stopToRoutes.computeIfAbsent(stop, k -> new ArrayList<>()).add(i);
            }
        }
        
        // BFS on routes (buses), not stops
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visitedRoutes = new HashSet<>();
        Set<Integer> visitedStops = new HashSet<>();
        
        // Initialize with all routes passing through source
        visitedStops.add(source);
        for (int routeIdx : stopToRoutes.getOrDefault(source, new ArrayList<>())) {
            queue.offer(routeIdx);
            visitedRoutes.add(routeIdx);
        }
        
        int buses = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            // Process all routes at current BFS level
            for (int i = 0; i < size; i++) {
                int routeIdx = queue.poll();
                
                // Visit all stops on this route
                for (int stop : routes[routeIdx]) {
                    if (stop == target) return buses;
                    
                    if (!visitedStops.contains(stop)) {
                        visitedStops.add(stop);
                        // Add all unvisited routes passing through this stop
                        for (int nextRoute : stopToRoutes.getOrDefault(stop, new ArrayList<>())) {
                            if (!visitedRoutes.contains(nextRoute)) {
                                visitedRoutes.add(nextRoute);
                                queue.offer(nextRoute);
                            }
                        }
                    }
                }
            }
            buses++;
        }
        
        return -1;
    }
}