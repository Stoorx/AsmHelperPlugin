// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NASMInstruction extends PsiElement {

  @Nullable
  NASMDirective getDirective();

  @NotNull
  List<NASMExpr> getExprList();

  @Nullable
  PsiElement getAvx2Op();

  @Nullable
  PsiElement getAvx512Op();

  @Nullable
  PsiElement getAvxOp();

  @Nullable
  PsiElement getFpuOp();

  @Nullable
  PsiElement getGeneralOp();

  @Nullable
  PsiElement getMmxOp();

  @Nullable
  PsiElement getOpPrefix();

  @Nullable
  PsiElement getSizeType();

  @Nullable
  PsiElement getSse2Op();

  @Nullable
  PsiElement getSse3Op();

  @Nullable
  PsiElement getSse4Op();

  @Nullable
  PsiElement getSseOp();

  @Nullable
  PsiElement getSystemOp();

  @Nullable
  PsiElement getVirtualizationOp();

  @Nullable
  PsiElement getX64Op();

}
