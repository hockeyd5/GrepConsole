package krasa.grepconsole.plugin;

import java.util.ArrayList;
import java.util.Arrays;

import org.jetbrains.annotations.NotNull;

import com.intellij.execution.actions.ConsoleActionsPostProcessor;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.actionSystem.AnAction;

public class GrepConsoleActionsPostProcessor implements ConsoleActionsPostProcessor {

	@NotNull
	@Override
	public AnAction[] postProcess(@NotNull ConsoleView console, @NotNull AnAction[] actions) {
		ArrayList<AnAction> anActions = new ArrayList<AnAction>();
		anActions.add(new OpenSettingsAction(console));
		anActions.addAll(Arrays.asList(actions));
		return anActions.toArray(new AnAction[anActions.size()]);
	}
}