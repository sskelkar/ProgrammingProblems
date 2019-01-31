package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;

public class CombinationSum {
  public List<List<Integer>> of(int[] candidates, int target) {
    Object[] targets = new Object[target + 1];
    targets[0] = new ArrayList();
    Arrays.sort(candidates);

    for (int c = 0; c < candidates.length; c++) {
      for (int t = 1; t < targets.length; t++) {
        if (t >= candidates[c]) {
          addCandidateToCombos(targets, t, t - candidates[c], candidates[c]);
        }
      }
    }

    return targets[targets.length - 1] == null ? emptyList() : (List<List<Integer>>) targets[targets.length - 1];
  }

  private void addCandidateToCombos(Object[] targets, int currIndex, int indexBeforeCandidate, int candidate) {
    if (targets[indexBeforeCandidate] == null) return;

    List<List<Integer>> existingCombos = (List<List<Integer>>) targets[indexBeforeCandidate];
    List<List<Integer>> newCombos = new ArrayList<>(existingCombos);

    if(newCombos.isEmpty()) {
      List<Integer> newCombo = new ArrayList<>();
      newCombo.add(candidate);
      newCombos.add(newCombo);
    } else {
      newCombos.clear();
      for(List<Integer> combo : existingCombos) {
        List<Integer> newCombo = new ArrayList<>(combo);
        newCombo.add(candidate);
        newCombos.add(newCombo);
      }
    }

    if (targets[currIndex] == null)
      targets[currIndex] = new ArrayList<>();

    ((List<List<Integer>>) targets[currIndex]).addAll(newCombos);
  }
}
