package RelacionamentoClasses;

class Magia {
    private String nome;

    public Magia(String nome) {
        this.nome = nome;
    }

    public void executar() {
        System.out.println("A magia " + this.nome + " explode no ar!");
    }
}

class Item {
    public int bonusMagico;
    public String nomeItem;
    
    public Item(String nome, int bonus) {
        this.nomeItem = nome;
        this.bonusMagico = bonus;
    }

    public void brilhar() {
        System.out.println(nomeItem + " brilha com poder!");
    }
}

class Mago {
    private Item itemEquipado;
    private String nome;

    public Mago(String nome)
    {
        itemEquipado = null;
        this.nome = nome;
    }

    public void falar()
    {
        System.out.println(nome + " diz: 'Pelas barbas de Merlin!'");
    }

    // A associação ocorre aqui: o Mago recebe a Magia para interagir com ela
    public void lancar(Magia magia) {
        System.out.println("Mago prepara o feitiço...");
        magia.executar();
    }

    // O Mago recebe o item de uma fonte externa - Exemplo de agregação!!!
    public void equiparItem(Item item) {
        this.itemEquipado = item;
        if(item != null) {
              System.out.println("Mago equipou o item.");
        }
    }

    // Aqui o desequipar apenas faz com que o mago não tenha mais acesso aos dados do item na memória,
    // item permanece existindo no Main
    public void desequiparItem() {
        itemEquipado = null;
        System.out.println("Mago desequipou o item.");
    }
    
    public void lancarMagiaForte() {
        int poderBase = 10;
        if (itemEquipado != null) {
            itemEquipado.brilhar();
            int poderTotal = poderBase + itemEquipado.bonusMagico;
            System.out.println("Mago lanca magia com poder " + poderTotal + "!");
        } 
        else {
            System.out.println("Mago lanca magia com poder " + poderBase + ".");
        }
    }

}

