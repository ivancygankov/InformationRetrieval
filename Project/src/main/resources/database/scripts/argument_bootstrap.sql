CREATE TABLE IF NOT EXISTS argument (
  argID SERIAL PRIMARY KEY,
  pID INT REFERENCES premise NOT NULL,
  crawlID TEXT UNIQUE NOT NULL,
  content text NOT NULL,
  totalTokens INT NOT NULL,
  isPro BOOLEAN NOT NULL,
  length INT
);