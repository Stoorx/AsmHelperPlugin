// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NASMDirective extends PsiElement {

  @NotNull
  List<NASMDirectiveArg> getDirectiveArgList();

  @Nullable
  NASMMapOption getMapOption();

  @Nullable
  PsiElement getDirectiveOp();

}
