// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMIStruc;
import gen.AsmHelperPlugin.psi.NASMStruc;
import gen.AsmHelperPlugin.psi.NASMStructure;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NASMStructureImpl extends ASTWrapperPsiElement implements NASMStructure {

  public NASMStructureImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitStructure(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NASMIStruc getIStruc() {
    return findChildByClass(NASMIStruc.class);
  }

  @Override
  @Nullable
  public NASMStruc getStruc() {
    return findChildByClass(NASMStruc.class);
  }

}
