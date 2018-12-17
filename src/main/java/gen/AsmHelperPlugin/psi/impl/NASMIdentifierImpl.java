// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import AsmHelperPlugin.psi.NASMNamedElementImpl;
import AsmHelperPlugin.psi.NASMPsiImplUtil;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.util.IncorrectOperationException;
import gen.AsmHelperPlugin.psi.NASMIdentifier;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.ID;

public class NASMIdentifierImpl extends NASMNamedElementImpl implements NASMIdentifier {

  public NASMIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

  @Nullable
  @Override
  public PsiElement getNameIdentifier() {
    return NASMPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
    return NASMPsiImplUtil.setName(this, name);
  }
}
