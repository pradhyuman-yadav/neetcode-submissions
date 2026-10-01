class Solution:

    def encode(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return "NADA"
        return "#%!".join(strs)

    def decode(self, s: str) -> List[str]:
        if s == "NADA":
            return []
        
        return s.split("#%!")
