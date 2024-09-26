import unittest
from main import get_count

class Test_solution(unittest.TestCase):
    def test_null_sentence(self):
        self.assertEqual(get_count(""), 0)

    def test1(self):
        self.assertEqual(get_count("string"), 1)

    def test2(self):
        self.assertEqual(get_count("y"), 0)

    def test3(self):
        self.assertEqual(get_count("bcdfghjklmnpqrstvwxz y"), 0)

    def test4(self):
        self.assertEqual(get_count("abracadabra"), 5)

if __name__ == '__main__':
    unittest.main()