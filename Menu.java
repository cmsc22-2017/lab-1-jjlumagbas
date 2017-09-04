interface Menu {}

class Soup implements Menu {
  String name;
  int price;
  boolean isVegetarian;

  Soup(String name, int price, boolean isVegetarian) {
    this.name = name;
    this.price = price;
    this.isVegetarian = isVegetarian;
  }
}

class Salad implements Menu {
  String name;
  int price;
  boolean isVegetarian;
  String dressing;

  Salad(String name, int price, boolean isVegetarian, String dressing) {
    this.name = name;
    this.price = price;
    this.isVegetarian = isVegetarian;
    this.dressing = dressing;
  }
}

class Sandwich implements Menu {
  String name;
  int price;
  String bread;
  String filling1;
  String filling2;

  Sandwich(String name, int price, String bread, String filling1, String filling2) {
    this.name = name;
    this.price = price;
    this.bread = bread;
    this.filling1 = filling1;
    this.filling2 = filling2;
  }
}

class ExamplesMenu {
  ExamplesMenu() {}

  Menu ceasarSalad = new Salad("Ceasar Salad", 50, true, "Ceasar");
  Menu tunaSandwich = new Sandwich("Tuna Sandwich", 50, "Wheat", "Tuna", "Mayo");
  Menu mushroomSoup = new Soup("Mushroom Soup", 50, true);
}
