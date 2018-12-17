// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMNumericLiteral;
import gen.AsmHelperPlugin.psi.NASMTypes;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NASMNumericLiteralImpl extends NASMExprImpl implements NASMNumericLiteral {

  public NASMNumericLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitNumericLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBinary() {
      return findChildByType(NASMTypes.BINARY);
  }

  @Override
  @Nullable
  public PsiElement getCharacter() {
      return findChildByType(NASMTypes.CHARACTER);
  }

  @Override
  @Nullable
  public PsiElement getDecimal() {
      return findChildByType(NASMTypes.DECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getHexadecimal() {
      return findChildByType(NASMTypes.HEXADECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getSizeType() {
      return findChildByType(NASMTypes.SIZE_TYPE);
  }

  @Override
  @Nullable
  public PsiElement getZeroes() {
      return findChildByType(NASMTypes.ZEROES);
  }

}
