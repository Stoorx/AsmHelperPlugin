// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface NASMLabel extends PsiElement {

  @Nullable
  NASMData getData();

  @Nullable
  NASMInstruction getInstruction();

  @Nullable
  NASMLabelDefMacro getLabelDefMacro();

  @Nullable
  NASMStructure getStructure();

  @Nullable
  PsiElement getLblDef();

  //WARNING: getLabelIdentifierString(...) is skipped
  //matching getLabelIdentifierString(NASMLabel, ...)
  //methods are not found in NASMPsiImplUtil

}
