class Foo:
    def __init__(self):
        self.lock_first_done = threading.Lock()
        self.lock_second_done = threading.Lock()
        
        self.lock_first_done.acquire()
        self.lock_second_done.acquire()


    def first(self, printFirst: 'Callable[[], None]') -> None:
        
        # printFirst() outputs "first". Do not change or remove this line.
        printFirst()
        self.lock_first_done.release()

    def second(self, printSecond: 'Callable[[], None]') -> None:
        with self.lock_first_done:
        # printSecond() outputs "second". Do not change or remove this line.
            printSecond()
            self.lock_second_done.release()

    def third(self, printThird: 'Callable[[], None]') -> None:
        with self.lock_second_done:

        # printThird() outputs "third". Do not change or remove this line.
            printThird()