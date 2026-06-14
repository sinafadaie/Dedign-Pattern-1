package visitor.Mosh;

//over load apply method based on our entity
//if we create new "node" (new entity)
//we have to modify this class
//so we should this when our obj structure is stable
//(our nodes are stabled, and we don't want to create new node)
public interface Operation {

    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
