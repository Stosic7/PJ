public enum OsnovnaBoja {
    CRVENA {
        @Override
        public char engSlovo() {
            return 'R';
        }
    },
    ZELENA {
        @Override
        public char engSlovo() {
            return 'G';
        }
    },
    PLAVA {
        @Override
        public char engSlovo() {
            return 'B';
        }
    };

    public abstract char engSlovo();
}
