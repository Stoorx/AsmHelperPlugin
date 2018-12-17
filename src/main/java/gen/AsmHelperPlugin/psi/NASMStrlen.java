// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NASMStrlen extends PsiElement {

  @NotNull
  List<NASMIdentifier> getIdentifierList();

  @Nullable
  PsiElement getString();

  @NotNull
  PsiElement getStrlenTag();

}
