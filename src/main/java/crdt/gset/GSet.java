package crdt.gset;

import java.util.HashSet;
import java.util.Set;

/**
 * Grow-only Set
 */
public class GSet<T> {
  private final Set<T> set;

  public GSet() {
    this.set = new HashSet<>();
  }

  public GSet(Set<T> set) {
    this.set = set;
  }

  void add(T element) {
    this.set.add(element);
  }

  boolean query(T element) {
    return set.contains(element);
  }

  boolean compare(GSet<T> other) {
    for (T t : other.getSet()) {
      if (!this.set.contains(t))
        return false;
    }
    return true;
  }

  void merge(GSet<T> other) {
    this.set.addAll(other.getSet());
  }

  public Set<T> getSet() {
    return set;
  }
}
