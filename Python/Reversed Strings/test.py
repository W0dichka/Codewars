import unittest
from main import solution

class Test_solution(unittest.TestCase):
    def test_null_solution(self):
        self.assertEqual(solution(""), "")

    def test1_solution(self):
        self.assertEqual(solution("world"), "dlrow")

    def test2_solution(self):
        self.assertEqual(solution("word"), "drow")

    def test3_solution(self):
        self.assertEqual(solution("123"), "321")

if __name__ == '__main__':
    unittest.main()