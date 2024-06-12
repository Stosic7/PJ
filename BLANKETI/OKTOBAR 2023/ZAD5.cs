public class NizEnumerator<T> : IEnumerator<T>
    {
        private T[] niz;
        private int pozicija = -1;

        public NizEnumerator(T[] niz)
        {
            this.niz = niz;
        }

        public T Current
        {
            get
            {
                return niz[pozicija];
            }
        }

        public bool MoveNext()
        {
            pozicija++;
            return pozicija < niz.Length;
        }

        public void Reset()
        {
            pozicija = -1;
        }
    }
