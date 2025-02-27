package minijavac.SyntaxTree.classes;

import minijavac.SyntaxTree.Identifier;
import minijavac.SyntaxTree.visitor.ASTVisitor;
import minijavac.SyntaxTree.visitor.Visitable;
import minijavac.SyntaxTree.type.Type;

public class VarDecl implements Visitable {
    public Type type;
    public Identifier name;

    public VarDecl(Type type, Identifier name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
