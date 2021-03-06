public class QuickFindUF {

    private int[] id;

    public QuickFindUF( int N ) {
        id = new int[N];
        for ( int i = 0; i < id.length; i++ ) {
            id[i] = i;
        }
    }

    public Boolean connected( int p, int q ) {
        return ( id[p] == id[q] );
    }

    public void union( int p, int q ) {
        int p_id = id[p];
        int q_id = id[q];
        for ( int i = 0; i < id.length; i++ ) {
            if ( id[i] == p_id ) {
                id[i] = q_id;
            }
        }
    }

    // A bit quicker
    public int root(int p){
        while( p != id[p]) p = id[p];
        return p;
    }

    public Boolean connected2( int p, int q ) {
        return ( root(p) == root(q) );
    }

    public void union2( int p, int q ) {
        int p_root = root(p);
        int q_root = root(q);
        id[p_root] = q_root;
    }

    public void print(){
        for(int i = 0; i < id.length; i++){
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }

}
