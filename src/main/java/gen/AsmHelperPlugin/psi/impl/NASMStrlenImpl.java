// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import gen.AsmHelperPlugin.psi.NASMIdentifier;
import gen.AsmHelperPlugin.psi.NASMStrlen;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static gen.AsmHelperPlugin.psi.NASMTypes.STRING;
import static gen.AsmHelperPlugin.psi.NASMTypes.STRLEN_TAG;

public class NASMStrlenImpl extends ASTWrapperPsiElement implements NASMStrlen {

  public NASMStrlenImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitStrlen(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NASMIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

  @Override
  @NotNull
  public PsiElement getStrlenTag() {
    return findNotNullChildByType(STRLEN_TAG);
  }

}
