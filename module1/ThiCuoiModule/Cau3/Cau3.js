class Book {
    constructor(TS,NXB,SQ) {
        this.TS = TS;
        this.NXB = NXB;
        this.SQ = SQ;
    }
    muon() {
       this.SQ--;
    }
    add() {
        this.SQ++;
    }
    tinhTrang() {
        if (this.SQ > 0) {
            return true;
        } else {
            return false;
        }
    }
}
let book = new Book('Toán', 2000, 4);
alert(book.tinhTrang());
