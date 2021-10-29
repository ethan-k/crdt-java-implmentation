package crdt.gset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GSetTest {

  @Test
  void queryShouldReturnTrueIfElementExistsInQuery() {
    GSet<String> gSet = new GSet<>();

    gSet.add("ABC");
    gSet.add("DEF");

    Assertions.assertTrue(gSet.query("ABC"));
  }

}