// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMDirective extends PsiElement {

  @NotNull
  List<NASMDirectiveArg> getDirectiveArgList();

  @Nullable
  NASMMapOption getMapOption();

  @Nullable
  PsiElement getDirectiveOp();

}
