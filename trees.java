import java.util.*;

public  class trees {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        node root = createtree();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();

    }
    public static node createtree(){
        node root = null;
        System.out.println("Enter Data:");
        int data = sc.nextInt();
        if (data == -1) return null;
        
        root = new node(data);
        System.out.println("Enter left for " + data);
        root.left = createtree();

        System.out.println("Enter right for "+ data);
        root.right = createtree();
        return root;
    }
    public static void inorder(node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(node root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(node root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }
}
class node {
    node left,right;
    int data;
    public node(int data){
        this.data = data;
    }
}
